package transport

fun main(){
    val transports = listOf<Transport>(
        Horse("Racehorse", 20,1),
        Dragon("Partyrnaks", 50, 3),
        Boat("Boat", 15, 4),
        Teleport("Far step", 100000, 1)
    )
    for (transport in transports){
        transport.describe()
        transport.move()
        transport.specialAbility()
        println()
    }
}
