package com.abbas.restusersoathtest.controller;

import com.abbas.restusersoathtest.dto.Comment;
import com.abbas.restusersoathtest.dto.Posts;
import com.abbas.restusersoathtest.dto.Users;
import com.abbas.restusersoathtest.exception.ThirdPartyApiNotAvailbleException;
import com.abbas.restusersoathtest.service.UsersRecordServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersRecordController {

    final UsersRecordServiceImpl usersRecordService;

    public UsersRecordController(UsersRecordServiceImpl usersRecordService) {
        this.usersRecordService = usersRecordService;
    }


    @GetMapping("/api/v3/users")
    public List<Users> getAllUsers() throws ThirdPartyApiNotAvailbleException {
        return usersRecordService.getAllUsers();
    }

    @GetMapping("/api/v3/posts")
    public List<Posts> getAllPosts() throws ThirdPartyApiNotAvailbleException {
        return usersRecordService.getAllPosts();
    }

    @GetMapping("/api/v3/comments")
    public List<Comment> getAllComments() throws ThirdPartyApiNotAvailbleException {
        return usersRecordService.getAllComments();
    }

}
