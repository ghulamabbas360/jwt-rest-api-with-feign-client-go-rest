package com.abbas.restusersoathtest.client;


import com.abbas.restusersoathtest.config.FeignClientConfig;
import com.abbas.restusersoathtest.dto.Comment;
import com.abbas.restusersoathtest.dto.Posts;
import com.abbas.restusersoathtest.dto.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="goRestClient" ,url = "https://gorest.co.in/public/v2", configuration = FeignClientConfig.class)
public interface GoRestClient {

    @GetMapping("/users")
    public List<Users> getAllUsers();

    @GetMapping("/comments")
    public List<Comment> getAllComments();

    @GetMapping("/posts")
    public List<Posts> getAllPosts();

}
