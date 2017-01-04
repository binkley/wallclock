package hm.binkley.labs

import hm.binkley.labs.WallClock.Words.FIVE_PAST

class WallClock {
    enum class Words(vararg words: String) {
        FIVE_PAST("five", "past")
    }

    val minutes = Minutes()

    class Minutes {
        operator fun get(minute: Int) = when (minute) {
            in 1..5 -> FIVE_PAST
            else -> throw IllegalArgumentException()
        }
    }
}
