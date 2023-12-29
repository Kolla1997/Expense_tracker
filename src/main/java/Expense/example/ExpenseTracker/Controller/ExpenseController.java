package Expense.example.ExpenseTracker.Controller;

import Expense.example.ExpenseTracker.Model.Expenses;
import Expense.example.ExpenseTracker.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/api/ExpenseTracker")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/home")
    public String Home(Model model) {
        model.addAttribute("expense", new Expenses());
        return "home";
    }

    @GetMapping("/records")
    public ModelAndView getRecords() {
        List<Expenses> ex=expenseService.getAllExpenses();
        return new ModelAndView("allRecords","record",ex);
    }

    @PostMapping("/add")
    public String addExpense(@ModelAttribute Expenses expenses) {
        expenseService.add(expenses);
        return "redirect:/api/ExpenseTracker/home";
    }

    @GetMapping("/getAll")
    public List<Expenses> getAllExpenses() {
        return expenseService.getAllExpenses();
    }
}
