package net.media.training.live.srp;

public class HtmlPrinter{
    private Employee Employee;

    HtmlPrinter(Employee Employee){
        this.Employee = Employee;
    }
    public int totalLeaveLeftPreviously(int years){
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += Employee.getLeavesLeftPreviously()[Employee.getYearsInOrg()-i-1];
        }
        return totalLeaveLeftPreviously;
    }
    public String toHtml() {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + Employee.getEmpId() + "'>" +
                "<span>" + Employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (Employee.getTotalLeaveAllowed() - Employee.getLeaveTaken()) + "</span>";
        str += "<span>" + Math.round(Employee.getMonthlySalary() * 12) + "</span>";
        if (Employee.getManager() != null) str += "<span>" + Employee.getManager() + "</span>";
        else str += "<span>None</span>";
        int years = 3;
        if (Employee.getYearsInOrg() < 3) {
            years = Employee.getYearsInOrg();
        }
        // int totalLeaveLeftPreviously = 0;
        // for (int i = 0; i < years; i++) {
        //     totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        // }
        str += "<span>" + totalLeaveLeftPreviously(years) + "</span>";
        return str + "</div> </div>";
    }

}
