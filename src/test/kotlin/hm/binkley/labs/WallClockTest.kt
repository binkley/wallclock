package hm.binkley.labs

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class WallClockTest {
    lateinit var wallClock: WallClock

    @BeforeEach
    fun setUpClock() {
        wallClock = WallClock()
    }

    @Test
    fun wrongMinutes() {
        assertThrows<Exception>(IllegalArgumentException::class.java) {
            wallClock.minutes[-1]
        }
    }

    @Test
    fun fiveMinutes() = assertEquals(arrayListOf("five", "past"),
            wallClock.minutes[5])
}
