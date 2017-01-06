package hm.binkley.labs

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/** @todo Use JUnit 5 parameterized tests, when available (M4?) */
internal class WallClockTest {
    lateinit var wallClock: WallClock

    @BeforeEach
    fun setUpClock() {
        wallClock = WallClock()
    }

    @Test
    fun wrongMinutes() = assertThrows<Exception>(
            IllegalArgumentException::class.java) {
        wallClock.minutes[-1]
    }!!

    @Test
    fun noGaps() {
        for (minute in 0..60)
            wallClock.minutes[minute]
    }

    @Test
    fun fiveTo() = assertEquals(arrayListOf("five", "to"),
            wallClock.minutes[56])

    @Test
    fun tenTo() = assertEquals(arrayListOf("ten", "to"),
            wallClock.minutes[51])

    @Test
    fun quarterTo() = assertEquals(arrayListOf("quarter", "to"),
            wallClock.minutes[46])

    @Test
    fun twentyTo() = assertEquals(arrayListOf("twenty", "to"),
            wallClock.minutes[41])

    @Test
    fun twentyFiveTo() = assertEquals(arrayListOf("twenty", "five", "to"),
            wallClock.minutes[31])

    @Test
    fun fivePast() = assertEquals(arrayListOf("five", "past"),
            wallClock.minutes[1])

    @Test
    fun tenPast() = assertEquals(arrayListOf("ten", "past"),
            wallClock.minutes[11])

    @Test
    fun quarterPast() = assertEquals(arrayListOf("quarter", "past"),
            wallClock.minutes[16])

    @Test
    fun twentyPast() = assertEquals(arrayListOf("twenty", "past"),
            wallClock.minutes[21])

    @Test
    fun twentyFivePast() = assertEquals(arrayListOf("twenty", "five",
            "past"),
            wallClock.minutes[26])

    @Test
    fun halfPast() = assertEquals(arrayListOf("half", "past"),
            wallClock.minutes[30])
}
