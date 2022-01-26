package ms.reference.referenceApp.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

interface PeopleService {
    fun getPerson(name: String): String
    fun getPeople(): List<String>
}

@Profile("default")
@Service
class PeopleServiceImpl : PeopleService {
    override fun getPerson(name: String): String {
        TODO("Not yet implemented")
    }

    override fun getPeople() = listOf ("foobar", "fizbuzz")
}
