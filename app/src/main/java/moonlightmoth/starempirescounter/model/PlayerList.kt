package moonlightmoth.starempirescounter.model

class PlayerList {
    private val list = mutableListOf<Player>()

    fun addPlayer()
    {
        list.add(Player())
    }

    fun deleteLastPlayer(id: Int)
    {
        list.removeAt(id)
    }

    fun size() : Int
    {
        return list.size
    }

    fun getPlayer(id: Int) : Player
    {
        return list.get(id)
    }
}