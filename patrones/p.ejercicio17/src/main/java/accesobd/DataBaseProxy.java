package accesobd;

import java.util.Collection;
import java.util.List;

public class DataBaseProxy implements DatabaseAccess{
    private DatabaseRealAccess databaseRealAccess;
    private boolean authenticate;
    private final String password;

    public DataBaseProxy(String password, DatabaseRealAccess databaseRealAccess) {
        this.password = password;
        this.databaseRealAccess = databaseRealAccess;
        this.authenticate = false;
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if(this.authenticate){
            return this.databaseRealAccess.insertNewRow(rowData);
        }
        throw new RuntimeException("No estas autenticado boludito");
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if(this.authenticate){
            return this.databaseRealAccess.getSearchResults(queryString);
        }
        throw new RuntimeException("No estas autenticado boludito");
    }
    public boolean autenticar(String password){
        if(this.password.equals(password)){
            this.authenticate = true;
        }
        return authenticate;
    }
}
