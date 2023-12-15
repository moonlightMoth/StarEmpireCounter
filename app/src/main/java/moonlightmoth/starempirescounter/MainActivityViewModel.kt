package moonlightmoth.starempirescounter

import androidx.lifecycle.ViewModel
import moonlightmoth.starempirescounter.model.Player

class MainActivityViewModel : ViewModel() {

    val playerList = mutableListOf<Player>()

    fun addPlayer()
    {
        playerList.add(Player(playerList.size))
    }


}