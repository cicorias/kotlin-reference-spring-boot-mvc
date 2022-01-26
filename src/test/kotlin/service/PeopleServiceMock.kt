package ms.reference.referenceApp.service

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service


@Profile("test")
@Service
class PeopleServiceMock : PeopleService {
    override fun getPerson(name: String) = "Mock Person"

    override fun getPeople() = listOf ("mock1", "mock2")
}