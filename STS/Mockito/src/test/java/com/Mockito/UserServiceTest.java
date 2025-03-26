package com.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository; // Mocking dependency

    @InjectMocks
    private UserService userService; // Injecting mock into service

    @Test
    public void testGetUserByName() {
        // Arrange: Define behavior of mocked repository
        User mockUser = new User();
        mockUser.setName("John");
        Mockito.when(userRepository.findByName("John")).thenReturn(Optional.of(mockUser));

        // Act: Call service method
        User user = userService.getUserByName("John");

        // Assert: Verify the expected behavior
        assertNotNull(user);
        assertEquals("John", user.getName());
    }

    @Test
    public void testGetUserByName_NotFound() {
        Mockito.when(userRepository.findByName("Invalid")).thenReturn(Optional.empty());

        Exception exception = assertThrows(RuntimeException.class, () -> userService.getUserByName("Invalid"));
        assertEquals("User not found", exception.getMessage());
    }
}

