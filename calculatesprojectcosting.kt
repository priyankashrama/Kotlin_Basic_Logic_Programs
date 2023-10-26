fun main() {
    // Define the cost per module
    val costPerModule = 1000 // Change this to your desired cost per module

    // Prompt the user to enter the number of modules
    print("Enter the number of modules: ")
    val numberOfModules = readLine()?.toInt() ?: 0

    // Calculate the project cost
    val totalCost = numberOfModules * costPerModule

    // Display the result
    println("Project Cost for $numberOfModules modules is: $$totalCost")
}
