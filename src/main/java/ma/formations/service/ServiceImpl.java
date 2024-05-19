package ma.formations.service;

import ma.formations.dao.DaoImpl;

public class ServiceImpl {
    private DaoImpl dao;
    public ServiceImpl(DaoImpl dao) {
        this.dao = dao;
    }
    public boolean query(String query) {
        return dao.isAvailable();
    }
    @Override
    public String toString() {
        return "Using database with id: " + String.valueOf(dao.getUniqueId());
    }
}
