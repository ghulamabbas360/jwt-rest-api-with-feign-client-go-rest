package com.abbas.restusersoathtest.service;

import com.abbas.restusersoathtest.dto.Comment;
import com.abbas.restusersoathtest.dto.Posts;
import com.abbas.restusersoathtest.dto.Users;
import com.abbas.restusersoathtest.exception.ThirdPartyApiNotAvailbleException;

import java.util.List;

public interface UsersRecordsService {

    public List<Users> getAllUsers() throws ThirdPartyApiNotAvailbleException;

    public List<Posts> getAllPosts() throws ThirdPartyApiNotAvailbleException;;

    public List<Comment> getAllComments() throws ThirdPartyApiNotAvailbleException;
}
