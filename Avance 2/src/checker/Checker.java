package checker;
import generated.Parser2;
import generated.Parser2BaseVisitor;

public class Checker extends Parser2BaseVisitor{
    private SymbolTable tablaIDs = null;

    public Checker(){
        this.tablaIDs = new SymbolTable();
    }

    /*
    * Permite retornar un mensaje de error a partir del error obtenido
    * */
    public String Print_Errors(int error_code){
        switch (error_code){
            case 3 :
                return "La función llamada no retorna un valor.";
            case 4:
                return "No se puede declarar un identificador con ese nombre.";
            case 5:
                return "Ese identificador ya fue declarado.";
            case 6:
                return "Ese indetificador no ha sido declarado."
            case 7:
                return "Error de tipos, valores no compatibles.";
            case 8:
                return "Esa función no ha sido declarado.";
            case 9:
                return "La variable que intenta retornar no ha sido declarada en la función.";
            case 10:
                return "Valor compatible para acceder a la lista.";
            case 11:
                return "La expresión del IF no es válida.";
            default:
                return "Error no identificado.";
        }
    }

    @Override
    public Object visitProgAST(Parser2.ProgASTContext ctx) {
        return super.visitProgAST(ctx);
    }

    @Override
    public Object visitStLETAST(Parser2.StLETASTContext ctx) {
        return super.visitStLETAST(ctx);
    }

    @Override
    public Object visitStRETURNAST(Parser2.StRETURNASTContext ctx) {
        return super.visitStRETURNAST(ctx);
    }

    @Override
    public Object visitStExprAST(Parser2.StExprASTContext ctx) {
        return super.visitStExprAST(ctx);
    }

    @Override
    public Object visitLsAsignAST(Parser2.LsAsignASTContext ctx) {
        return super.visitLsAsignAST(ctx);
    }

    @Override
    public Object visitRsExprAST(Parser2.RsExprASTContext ctx) {
        return super.visitRsExprAST(ctx);
    }

    @Override
    public Object visitEsExprAST(Parser2.EsExprASTContext ctx) {
        return super.visitEsExprAST(ctx);
    }

    @Override
    public Object visitExprAddAST(Parser2.ExprAddASTContext ctx) {
        return super.visitExprAddAST(ctx);
    }

    @Override
    public Object visitCompAST(Parser2.CompASTContext ctx) {
        return super.visitCompAST(ctx);
    }

    @Override
    public Object visitAddExprAST(Parser2.AddExprASTContext ctx) {
        return super.visitAddExprAST(ctx);
    }

    @Override
    public Object visitAddFactorAST(Parser2.AddFactorASTContext ctx) {
        return super.visitAddFactorAST(ctx);
    }

    @Override
    public Object visitMultExprAST(Parser2.MultExprASTContext ctx) {
        return super.visitMultExprAST(ctx);
    }

    @Override
    public Object visitMultFactorAST(Parser2.MultFactorASTContext ctx) {
        return super.visitMultFactorAST(ctx);
    }

    @Override
    public Object visitElemExprAST(Parser2.ElemExprASTContext ctx) {
        return super.visitElemExprAST(ctx);
    }

    @Override
    public Object visitElemAccessAST(Parser2.ElemAccessASTContext ctx) {
        return super.visitElemAccessAST(ctx);
    }

    @Override
    public Object visitCallExprAST(Parser2.CallExprASTContext ctx) {
        return super.visitCallExprAST(ctx);
    }

    @Override
    public Object visitPExprINTAST(Parser2.PExprINTASTContext ctx) {
        return super.visitPExprINTAST(ctx);
    }

    @Override
    public Object visitPExprSTRINGAST(Parser2.PExprSTRINGASTContext ctx) {
        return super.visitPExprSTRINGAST(ctx);
    }

    @Override
    public Object visitPExprIDAST(Parser2.PExprIDASTContext ctx) {
        return super.visitPExprIDAST(ctx);
    }

    @Override
    public Object visitPExprTRUEAST(Parser2.PExprTRUEASTContext ctx) {
        return super.visitPExprTRUEAST(ctx);
    }

    @Override
    public Object visitPExprFALSEAST(Parser2.PExprFALSEASTContext ctx) {
        return super.visitPExprFALSEAST(ctx);
    }

    @Override
    public Object visitPExprGroupAST(Parser2.PExprGroupASTContext ctx) {
        return super.visitPExprGroupAST(ctx);
    }

    @Override
    public Object visitPExprArrayLitAST(Parser2.PExprArrayLitASTContext ctx) {
        return super.visitPExprArrayLitAST(ctx);
    }

    @Override
    public Object visitPExprArrayFuncAST(Parser2.PExprArrayFuncASTContext ctx) {
        return super.visitPExprArrayFuncAST(ctx);
    }

    @Override
    public Object visitPExprFuncLitAST(Parser2.PExprFuncLitASTContext ctx) {
        return super.visitPExprFuncLitAST(ctx);
    }

    @Override
    public Object visitPExprHashLitAST(Parser2.PExprHashLitASTContext ctx) {
        return super.visitPExprHashLitAST(ctx);
    }

    @Override
    public Object visitPExprPrintExprAST(Parser2.PExprPrintExprASTContext ctx) {
        return super.visitPExprPrintExprAST(ctx);
    }

    @Override
    public Object visitPExprIfExprAST(Parser2.PExprIfExprASTContext ctx) {
        return super.visitPExprIfExprAST(ctx);
    }

    @Override
    public Object visitAfLENAST(Parser2.AfLENASTContext ctx) {
        return super.visitAfLENAST(ctx);
    }

    @Override
    public Object visitAfFIRSTAST(Parser2.AfFIRSTASTContext ctx) {
        return super.visitAfFIRSTAST(ctx);
    }

    @Override
    public Object visitAfLASTAST(Parser2.AfLASTASTContext ctx) {
        return super.visitAfLASTAST(ctx);
    }

    @Override
    public Object visitAfRESTAST(Parser2.AfRESTASTContext ctx) {
        return super.visitAfRESTAST(ctx);
    }

    @Override
    public Object visitAfPUSHAST(Parser2.AfPUSHASTContext ctx) {
        return super.visitAfPUSHAST(ctx);
    }

    @Override
    public Object visitArrayLitAST(Parser2.ArrayLitASTContext ctx) {
        return super.visitArrayLitAST(ctx);
    }

    @Override
    public Object visitFuncLitAST(Parser2.FuncLitASTContext ctx) {
        return super.visitFuncLitAST(ctx);
    }

    @Override
    public Object visitFuncParamAST(Parser2.FuncParamASTContext ctx) {
        return super.visitFuncParamAST(ctx);
    }

    @Override
    public Object visitMoreIdentsAST(Parser2.MoreIdentsASTContext ctx) {
        return super.visitMoreIdentsAST(ctx);
    }

    @Override
    public Object visitHashLitAST(Parser2.HashLitASTContext ctx) {
        return super.visitHashLitAST(ctx);
    }

    @Override
    public Object visitHashContentAST(Parser2.HashContentASTContext ctx) {
        return super.visitHashContentAST(ctx);
    }

    @Override
    public Object visitMoreHashContentAST(Parser2.MoreHashContentASTContext ctx) {
        return super.visitMoreHashContentAST(ctx);
    }

    @Override
    public Object visitExprListMoreExprAST(Parser2.ExprListMoreExprASTContext ctx) {
        return super.visitExprListMoreExprAST(ctx);
    }

    @Override
    public Object visitExprListEmptyAST(Parser2.ExprListEmptyASTContext ctx) {
        return super.visitExprListEmptyAST(ctx);
    }

    @Override
    public Object visitMoreExprAST(Parser2.MoreExprASTContext ctx) {
        return super.visitMoreExprAST(ctx);
    }

    @Override
    public Object visitPrintExprAST(Parser2.PrintExprASTContext ctx) {
        return super.visitPrintExprAST(ctx);
    }

    @Override
    public Object visitIfExprAST(Parser2.IfExprASTContext ctx) {
        return super.visitIfExprAST(ctx);
    }

    @Override
    public Object visitBlockStatementAST(Parser2.BlockStatementASTContext ctx) {
        return super.visitBlockStatementAST(ctx);
    }
}
