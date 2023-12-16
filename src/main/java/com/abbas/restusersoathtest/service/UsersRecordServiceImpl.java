package com.abbas.restusersoathtest.service;

import com.abbas.restusersoathtest.client.GoRestClient;
import com.abbas.restusersoathtest.dto.Comment;
import com.abbas.restusersoathtest.dto.Posts;
import com.abbas.restusersoathtest.dto.Users;
import com.abbas.restusersoathtest.exception.ThirdPartyApiNotAvailbleException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersRecordServiceImpl implements UsersRecordsService {

    final GoRestClient goRestClient;

    public UsersRecordServiceImpl(GoRestClient goRestClient) {
        this.goRestClient = goRestClient;
    }

    @Override
    public List<Users> getAllUsers() throws ThirdPartyApiNotAvailbleException {
        List<Users> usersList = null;
        try {
            usersList = goRestClient.getAllUsers();
        } catch (Exception ex) {
            throw new ThirdPartyApiNotAvailbleException(" Users not available on gorest");
        }

        return usersList;

    }

    @Override
    public List<Posts> getAllPosts() throws ThirdPartyApiNotAvailbleException {

        List<Posts> postsList = null;
        try {
            postsList = goRestClient.getAllPosts();
        } catch (Exception ex) {
            throw new ThirdPartyApiNotAvailbleException(" Posts not available on gorest");
        }

        return postsList;

    }

    @Override
    public List<Comment> getAllComments() throws ThirdPartyApiNotAvailbleException {

        List<Comment> commentList = null;
        try {
            commentList = goRestClient.getAllComments();
        } catch (Exception ex) {
            throw new ThirdPartyApiNotAvailbleException(" Comments not available on gorest");
        }

        return commentList;
    }
}
