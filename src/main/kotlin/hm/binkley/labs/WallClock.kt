package hm.binkley.labs

class WallClock {
    val minutes = Minutes()

    class Minutes {
        operator fun get(minute: Int) = when (minute) {
            in 0..5 -> arrayListOf("five", "past")
            in 6..15 -> arrayListOf("ten", "past")
            in 15..19 -> arrayListOf("quarter", "past")
            in 20..24 -> arrayListOf("twenty", "past")
            in 25..29 -> arrayListOf("twenty", "five", "past")
            30 -> arrayListOf("half", "past")
            in 31..34 -> arrayListOf("twenty", "five", "to")
            in 35..44 -> arrayListOf("twenty", "to")
            in 45..49 -> arrayListOf("quarter", "to")
            in 50..54 -> arrayListOf("ten", "to")
            in 55..60 -> arrayListOf("five", "to")
            else -> throw IllegalArgumentException("Must be 0-59: $minute")
        }
    }
}
