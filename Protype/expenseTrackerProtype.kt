import java.time.LocalDate

data class Expense(val amount: Double, val category: String, val date: LocalDate)

class ExpenseTracker {
    private val expenses: MutableList<Expense> = mutableListOf()

    fun addExpense(amount: Double, category: String, date: LocalDate) {
        val expense = Expense(amount, category, date)
        expenses.add(expense)
    }

    fun getTotalExpense(): Double {
        return expenses.sumOf { it.amount }
    }

    fun getExpensesByCategory(category: String): List<Expense> {
        return expenses.filter { it.category == category }
    }

    fun getExpensesByDate(date: LocalDate): List<Expense> {
        return expenses.filter { it.date == date }
    }

    fun generateExpenseReport(): Map<String, Double> {
        val report = mutableMapOf<String, Double>()
        for (expense in expenses) {
            val category = expense.category
            val amount = report.getOrDefault(category, 0.0)
            report[category] = amount + expense.amount
        }
        return report
    }
}

fun main() {
    val expenseTracker = ExpenseTracker()

    expenseTracker.addExpense(50.0, "Food", LocalDate.now())
    expenseTracker.addExpense(30.0, "Transportation", LocalDate.now())
    expenseTracker.addExpense(20.0, "Food", LocalDate.now().minusDays(1))
    expenseTracker.addExpense(10.0, "Entertainment", LocalDate.now().minusDays(1))

    val totalExpense = expenseTracker.getTotalExpense()
    println("Total Expense: $totalExpense")

    val foodExpenses = expenseTracker.getExpensesByCategory("Food")
    println("Food Expenses: $foodExpenses")

    val todayExpenses = expenseTracker.getExpensesByDate(LocalDate.now())
    println("Today's Expenses: $todayExpenses")

    val expenseReport = expenseTracker.generateExpenseReport()
    println("Expense Report:")
    for ((category, amount) in expenseReport) {
        println("$category: $amount")
    }
}
