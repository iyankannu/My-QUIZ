package com.example.quizapp

object Constants{

    fun getQuestion():ArrayList<Question> {
        val QuestionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Which Country the flag belongs to",
             R.drawable.flag_india,
            "United States of America",
            "England",
            "India",
            "Germany",
            3
        )

        QuestionList.add(question1)

        // second Question
        val question2 = Question(
            2,
            "Which Country the flag belongs to",
            R.drawable.china_flag,
            "United States of America",
            "China",
            "India",
            "Germany",
            2
        )
        QuestionList.add(question2)

        // Third question
        val question3 = Question(
            3,
            "Which Country the flag belongs to",
            R.drawable.flagsouthafrica,
            "South Africa",
            "China",
            "India",
            "Germany",
            1
        )
        QuestionList.add(question3)
        // Fourth Question
        val question4 = Question(
            4,
            "Which Country the flag belongs to",
            R.drawable.england,
            "United States of America",
            "China",
            "England",
            "Germany",
            3
        )
        QuestionList.add(question4)

        // fifth Question
        val question5 = Question(
            5,
            "Which Country the flag belongs to",
            R.drawable.flag_germany,
            "England",
            "Australia",
            "India",
            "Germany",
            4
        )
        QuestionList.add(question5)

        // Six Question
        val question6 = Question(
            6,
            "Which Country the flag belongs to",
            R.drawable.swedenflag,
            "United States of America",
            "China",
            "Sweden",
            "Germany",
            3
        )
        QuestionList.add(question6)

        // Seven
        val question7 = Question(
            7,
            "Which Country the flag belongs to",
            R.drawable.srilankaflag,
            "United States of America",
            "Srilanka",
            "India",
            "Germany",
            2
        )
        QuestionList.add(question7)
        // Eight
        val question8 = Question(
            8,
            "Which Country the flag belongs to",
            R.drawable.westindies,
            "United States of America",
            "China",
            "India",
            "West Indies",
            4
        )
        QuestionList.add(question8)

        // Nine
        val question9 = Question(
            9,
            "Which Country the flag belongs to",
            R.drawable.usaflag,
            "United States of America",
            "China",
            "India",
            "Germany",
            1
        )
        QuestionList.add(question9)

        // Ten
        val question10 = Question(
            10,
            "Which Country the flag belongs to",
            R.drawable.flag_india,
            "India",
            "China",
            "USA",
            "Germany",
            1
        )
        QuestionList.add(question10)

        return QuestionList
    }
}