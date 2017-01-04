package hm.binkley.labs

import hm.binkley.labs.WallClock.Words.FIVE_PAST
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class WallClockTest {
    lateinit var wallClock: WallClock

    @BeforeEach
    fun setUpClock() {
        wallClock = WallClock()
    }

    @Test
    fun fiveMinutes() = assertEquals(FIVE_PAST, wallClock.minutes[5])
}
