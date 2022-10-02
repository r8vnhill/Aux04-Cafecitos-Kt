package cl.uchile.dcc.people

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNot
import io.kotest.matchers.shouldNotBe
import io.kotest.matchers.types.haveSameHashCodeAs
import io.kotest.matchers.types.shouldBeSameInstanceAs
import io.kotest.matchers.types.shouldNotBeSameInstanceAs

lateinit var person1: Person
lateinit var person2: Person
lateinit var person3: Person


fun setUpPeople() {
    person1 = Person("Mario")
    person2 = Person("Mario")
    person3 = Person("María")
}

open class PersonTest : FunSpec({
    beforeEach { setUpPeople() }
    test("Person should be equal to itself") {
        person1 shouldBeSameInstanceAs person1
        person1 shouldBe person1
    }

    test("A person is not equal to one of a different class") {
        person1 shouldNotBe "$person1"
    }

    test("Two people with the same name should be equal") {
        person1 shouldNotBeSameInstanceAs person2
        person1 shouldBe person2
    }

    test("Two people with different names should not be equal") {
        person1 shouldNotBe person3
    }

    test("Two people with the same name should have the same hash code") {
        person1 should haveSameHashCodeAs(person2)
    }

    test("Two people with different names should not have the same hash code") {
        person1 shouldNot haveSameHashCodeAs(person3)
    }

    test("The string representation of a person should be correct") {
        "$person1" shouldBe "Person { name=Mario, canMakeCoffee=false }"
    }
})
