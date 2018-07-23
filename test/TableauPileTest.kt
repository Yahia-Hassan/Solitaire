import org.junit.Test

import org.junit.Assert.*

class TableauPileTest {

    @Test
    fun addCards() {
        //arrange
        val tableauPile = TableauPile(mutableListOf(Card(12, spades)))
        val cards = mutableListOf(Card(11, clubs))

        //act
        tableauPile.addCards(cards)

        //assert
        assertEquals(1, tableauPile.cards.size)
    }

    @Test
    fun removeCards() {
    }
}