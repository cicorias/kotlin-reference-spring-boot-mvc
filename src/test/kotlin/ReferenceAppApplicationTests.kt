package ms.reference.referenceApp

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
//@ActiveProfiles("test")
class ReferenceAppApplicationTests {

	@Value("\${myprodsetting:not provided}")
	lateinit var settingOne: String

	@Test
	fun contextLoads() {
		println("value of settingOne: $settingOne")
	}

}
