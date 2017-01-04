package hm.binkley.labs

class WallClock {
    val minutes = Minutes()

    class Minutes {
        operator fun get(minute: Int) = when (minute) {
            in 1..5 -> arrayListOf("five", "past")
            else -> throw IllegalArgumentException("Must be 0-59: $minute")
        }
    }
}
