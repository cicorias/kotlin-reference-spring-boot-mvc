package ms.reference.referenceApp.web

import com.fasterxml.jackson.databind.ObjectMapper
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.web.servlet.function.RequestPredicates.contentType

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
internal class HelloControllerTest @Autowired constructor(
    val mockMvc: MockMvc,
    val objectMapper: ObjectMapper
){

    val baseUrl = "/api/hello"

    @Test
    fun `return a single person`() {
        val personName = "mock"
        mockMvc.get("$baseUrl/people/$personName}") {
            contentType = MediaType.APPLICATION_JSON
        }
            .andDo { print() }
            .andExpect {
                status { isOk() }
                content { contentType("text/plain;charset=UTF-8") }
                content {
                    string("Mock Person")
//                jsonPath("$.trust") { value("3.14") }
//                jsonPath("$.default_transaction_fee") { value("17") }
                }
            }
    }
    @Value("\${myprodsetting:not provided}")
    lateinit var settingOne: String

    @Test
    fun getPeople() {
        println("value of settingOne: $settingOne")
    }
}