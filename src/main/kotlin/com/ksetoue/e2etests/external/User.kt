package com.ksetoue.e2etests.external

import io.restassured.RestAssured
import io.restassured.specification.RequestSpecification
import org.slf4j.LoggerFactory

class User {
    private val logger = LoggerFactory.getLogger(this::class.java)

    private fun setup(): RequestSpecification {
        RestAssured.baseURI = "https://api.github.com"
        RestAssured.port = 443

        return RestAssured.given()
    }

    fun getUser() {
        val client = setup()
        val user = client.get("/users/ksetoue").body.asString()
        logger.info("user found: $user")
        assert(true)
    }
}