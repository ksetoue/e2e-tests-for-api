package com.ksetoue.e2etests

import com.ksetoue.e2etests.external.User
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestSwitcheApplication

fun main(args: Array<String>) {
	runApplication<TestSwitcheApplication>(*args)

	User().getUser()
}
