package d250613.web_structure.ui;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import d250613.member_project.model.Member;

public class _4SignupFrame extends JFrame {
    // =============================================================
    // 추가1

    // 파일 불러오는 경로를 전역으로 설정.
    private static final String FILE_NAME = "member.txt"; // 회원 정보 저장 파일명, csv 형식
    // 파일에서 불러온 멤버의 모든 정보를 담아둘 임시 공간 리스트
    private ArrayList<Member> members = new ArrayList<>();

    // Swing 관련 변수
    // 전체 흐름
    // 테이블 구성 -> DefaultTableModel 에 데이터 입력 -> JTable 이 모델을 받아 화면에 테이블로 출력
    // 테이블에서 수정, 추가, 삭제, 검색하거나 tableModel 갱싱됨.
    private DefaultTableModel tableModel; // Swing에서 테이블 데이터를 저장/관리하는 기본 모델 클래스
    private JTable memberTable; // Swing에서 표 형태(UI) 의 테이블 컴포넌트

    // 검색 관련 컴포넌트
    private JTextField searchField; // 검색어를 입력할수 있는 검색어 입력창. 선언만, 전역으로 사용가능.
    private JButton searchBtn; // 검색 버튼
    private JButton resetBtn; // 검색 초기화 버튼
    // =============================================================

    public _4SignupFrame() {
        setTitle("회원 가입");
        setSize(900, 500);
        setLocationRelativeTo(null); // 화면에 중앙 배치.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // =================================================================
        // 추가2.
        // 테이블 작업 부터 진행 하기.
        // 1) 테이블 헤더 만들기, 이름, 이메일, 패스워드, 가입일 ,
        String[] cols = { "이름", "이메일", "패스워드", "가입일" };
        tableModel = new DefaultTableModel(cols, 0) { // 익명클래스,
            public boolean isCellEditable(int row, int column) {
                return false; // 각테이블의 셀 클릭시 값이 변경이 되는 모드 기본, 안되게 변경함.
            }
        }; // 헤더제목, 0 빈테이블 생성,
           // 표 형태의 데이터를 ,-> 화면 출력용 테이블에 데이터 연결.
        memberTable = new JTable(tableModel);
        // 보여주는 테이블에, 데이터 많아지면, 스크롤이 가능하게, 스크롤 기능 첨부,
        JScrollPane scrollPane = new JScrollPane(memberTable); // 스크롤 기능이 있는 패널에 테이블 연결.

        // 버튼 있는 패널 생성.
        JPanel btnPanel = new JPanel(); // JPanel 의 기본 배치 관리자, FlowLayout ,나란히 배치.
        JButton addBtn = new JButton("회원가입");
        JButton updateBtn = new JButton("수정");
        JButton deleteBtn = new JButton("삭제");
        JButton reloadBtn = new JButton("새로고침");
        // 버튼을 패널에 붙이기.
        btnPanel.add(addBtn);
        btnPanel.add(updateBtn);
        btnPanel.add(deleteBtn);
        btnPanel.add(reloadBtn);

        // 검색 패널 생성
        JPanel searchPanel = new JPanel();
        searchField = new JTextField(20);
        searchBtn = new JButton("검색");
        resetBtn = new JButton("검색 초기화");
        // 검색 패널에 버튼 붙이기 작업.
        searchPanel.add(new JLabel("이름 또는 이메일 검색: "));
        searchPanel.add(searchField);
        searchPanel.add(searchBtn);
        searchPanel.add(resetBtn);

        // 레이아웃 배치 패널들 1) scrollPane : 데이터 테이블 2) btnPanel 버튼 3) searchPanel
        setLayout(new BorderLayout());
        add(searchPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
        // =================================================================

        // =================================================================
        // 추가3

        // 파일에서 데이터 불러오고 , 테이블 표시, 메서드 호출

        // 새로고침 기능 호출.

        // 각각의 버튼에 , 기능들을 붙이는 작업 이벤트 핸들러 작업.

        // 안내 문구 표시
        // JLabel label = new JLabel("여기는 회원 가입 화면입니다.", JLabel.CENTER);
        // add(label);

        // =================================================================

    }

    // =================================================================
    // 추가4
    // 각 기능들 정의,
    // 1) csv 파일에서 회원 목록 불러오기. loadMembersFromFile()

    // 2) 회원 목록을 CSV 파일에 저장, saveMembersToFile()

    // 3) JTable에 회원 데이터 반영 (새로고침)

    // 4) 검색 결괄 테이블에 반영

    // 5) 검색 기능 (이름 또는 이메일 검색어가 포함된 회원만 표시), 검색 결과만 표기.

    // 6) 회원 가입 입력 품, 다이얼 로그 창으로 작업, 자바버전으로

    // 7) 회원 수정 창

    // 8) 회원 삭제 기능.

    // =================================================================

}
