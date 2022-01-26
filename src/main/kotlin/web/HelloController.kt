package ms.reference.referenceApp.web

import ms.reference.referenceApp.service.PeopleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")
class HelloController(
    @Autowired
    private val service: PeopleService
) {
    @GetMapping("people/{name}")
    fun sayHello(@PathVariable name: String) = service.getPerson(name)

    @GetMapping("people")
    fun getPeople() = service.getPeople()
}