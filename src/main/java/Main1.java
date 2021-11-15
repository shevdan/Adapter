import authorize.Authorize;
import builder.ReportBuilder;
import db.Database;

public class Main1 {
    public static void main(String[] args) {
        Database db = new Database();
        Authorize auth = new Authorize();
        if (auth.авторизуватися(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
