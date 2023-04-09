package com.tech.dsa.playground.knight

import com.tech.dsa.playground.Knight
import com.tech.dsa.playground.Quest

abstract class AbstractKnight : Knight {

    private val linkedSetOfQuest = linkedSetOf<Quest>()

    override fun performQuestDuty(quest: Quest) {
        linkedSetOfQuest.add(quest)
        linkedSetOfQuest.forEach() {
            quest.embarkQuest()
        }
    }


}