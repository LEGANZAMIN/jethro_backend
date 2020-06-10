package com.sfc.legnaza.web;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sfc.legnaza.domain.User;
import com.sfc.legnaza.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class UserController {

	private final UserService userService;

	// 사용자 목록 조회
	@GetMapping("/api/v1/users")
	public List<User> findByUserList() {
		return userService.findByUserList();
	}

	// 사용자 목록 조회
	@GetMapping("/api/v1/users2")
	public List<User> findByUserList2() {
		return userService.findByUserList();
	}

}
