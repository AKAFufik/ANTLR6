import org.antlr.v4.runtime.Token;
public class BinExpr extends ExprNode {
    public final ExprNode left;
    public final Token op;
    public final ExprNode right;
    public BinExpr(ExprNode left, Token op, ExprNode right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }
    @Override
    public String toString() {
        return "(" + left.toString() + op.getText() + right.toString() + ")";
    }
}