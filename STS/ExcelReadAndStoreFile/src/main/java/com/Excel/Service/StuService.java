package com.Excel.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Excel.Entity.Student;
import com.Excel.Repository.StuRepository;

@Service
public class StuService {
	@Autowired
	StuRepository sturep;

	// store excel data in DB
	public String saveExcelData(MultipartFile file) {
		List<Student> studentList = new ArrayList<>();

		try {
			InputStream inputStream = file.getInputStream();
			Workbook workbook = WorkbookFactory.create(inputStream);
			org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
			// alternative for workbookfactory is XSSFworkbook its specifically working with
			// .xlsx files (Excel 2007 or later).
			// It is faster when working with large .xlsx files.
			XSSFWorkbook workbook1 = new XSSFWorkbook(inputStream);
			XSSFSheet sheet1 = workbook1.getSheetAt(0);
			Iterator<Row> rows = sheet.iterator();

			// Skip Header Row
			rows.next();
			while (rows.hasNext()) {
				Row row = rows.next();
				Student student = new Student();
				student.setId((int) row.getCell(0).getNumericCellValue());
				student.setName(row.getCell(1).getStringCellValue());
				student.setMarks((int) row.getCell(2).getNumericCellValue());

				studentList.add(student);
			}
			workbook.close();
			System.out.println(studentList);
			// Save to Database
			sturep.saveAll(studentList);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return "data save successfully";

	}

// using for loops to store the excel data in DB
	public String saveExcel(MultipartFile file) {
		List<Student> stulist = new ArrayList<>();
		try {
			InputStream is = file.getInputStream();
			XSSFWorkbook workbook = new XSSFWorkbook(is);
			XSSFSheet sheetAt = workbook.getSheetAt(0);

			boolean isheader = true;
			for (Row row : sheetAt) {
				if (isheader) {
					isheader = false;
					continue;
				}
				Student stu = new Student();
				stu.setId((int) row.getCell(0).getNumericCellValue());
				stu.setName(row.getCell(1).getStringCellValue());
				stu.setMarks((int) row.getCell(2).getNumericCellValue());
				stulist.add(stu);
			}
			sturep.saveAll(stulist);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return "data  successfully sended";
	}

	public List<Student> getAll() {
		return sturep.findAll();
	}

	// read excel data
	public List<Student> readExcelData(MultipartFile file) {
		List<Student> studentList = new ArrayList<>();

		try {
			InputStream inputStream = file.getInputStream();
			// XSSFWorkbook
			Workbook workbook = WorkbookFactory.create(inputStream);
			org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rows = sheet.iterator();

			// Skip Header Row
			rows.next();

			while (rows.hasNext()) {
				Row row = rows.next();

				Student student = new Student();
				student.setId((int) row.getCell(0).getNumericCellValue());
				student.setName(row.getCell(1).getStringCellValue());
				student.setMarks((int) row.getCell(2).getNumericCellValue());
				studentList.add(student);
			}
			workbook.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}

}
