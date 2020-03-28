package com.cursor.feign;

import com.cursor.model.Profile;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "profile-service", url = "http://localhost:8082/", configuration = Profile.class)
public interface AccountClient {

    @GetMapping("/allProfiles")
    List<Profile> getAllProfiles();
}
