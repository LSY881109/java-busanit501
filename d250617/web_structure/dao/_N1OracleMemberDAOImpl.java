package d250617.web_structure.dao;

import java.util.List;

import d250616.dto._10Member;

// 순서1
// 인터페이스를 구현한 구현체 클래스, JDBC 연결한 기능들 재정의, DAO 
public class _N1OracleMemberDAOImpl implements _9DAO_Inaterface {

    // 순서2, 전체 조회 기능 만들기,
    @Override
    public List<_10Member> findAll() {
        // JDBC의 Select 하는 부분 벤치 마킹해서, 기능을 만들기,
        return null;
    }

    @Override
    public _10Member findById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public boolean insert(_10Member member) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public boolean update(_10Member member) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public _10Member findByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByName'");
    }

}
