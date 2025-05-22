package com.ogiraffers.model.dao;

import com.ogiraffers.common.JDBCTemplate;
import com.ogiraffers.model.dto.EmployeeDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.ogiraffers.common.JDBCTemplate.getConnection;
import static com.ogiraffers.common.JDBCTemplate.close;

public class EmployeeDAO {

    private Connection con = getConnection();
    private Properties prop = new Properties();

    private ResultSet rset = null;
    Scanner sc = new Scanner(System.in);

    public EmployeeDAO() {
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ogiraffers/mapper/menu-query.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int selectAllEmp() {
        int result = 0;
        int empId = 0;

        PreparedStatement pstmt = null;

        String query = prop.getProperty("selectAllEmp");

        try {
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();

            while (rset.next()) {
                empId = rset.getInt("emp_id");
                String empName = rset.getString("emp_name");
                System.out.println(empId + ", " + empName);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(pstmt);
            close(rset);
        }
        return result;
    }

    public ResultSet selectByIdEmp() {


        String query = prop.getProperty("selectByIdEmp");

        PreparedStatement pstmt = null;

        try {
            pstmt = con.prepareStatement(query);

            System.out.print("조회할 직원의 사번을 입력하세요 (200~222) : ");
            int empId = sc.nextInt();

            pstmt.setInt(1, empId);

            rset = pstmt.executeQuery();

            if (rset.next()) {
                empId = rset.getInt("emp_id");
                String empName = rset.getString("emp_name");
                System.out.println(empId + ", " + empName);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(pstmt);
            close(rset);
        }
        return rset;

    }

    public int insertEmp() {
        int empId = 0;

        int result = 0;

        PreparedStatement pstmt = null;

        try {
            String query = prop.getProperty("insertEmp");

            pstmt = con.prepareStatement(query);

            System.out.print("새로운 직원의 이름을 입력하세요 : ");
            String empName = sc.nextLine();
            System.out.print("새로운 직원의 사번을 입력하세요 : ");
            empId = sc.nextInt();
            System.out.print("새로운 직원의 주민등록번호를 입력하세요 : ");
            sc.nextLine();
            String empNo = sc.nextLine();
            System.out.print("새로운 직원의 직급 코드를 입력하세요 : ");
            String jobCode = sc.nextLine();
            System.out.print("새로운 직원의 급여 등급을 입력하세요 : ");
            String salLevel = sc.nextLine();

            pstmt.setInt(1, empId);
            pstmt.setString(2, empName);
            pstmt.setString(3, empNo);
            pstmt.setString(4, jobCode);
            pstmt.setString(5, salLevel);

            result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("직원 등록 성공 !");
            } else {
                System.out.println("직원 등록 실패 ... ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int modifyEmp() {
        int result = 0;
        int empId = 0;
        PreparedStatement pstmt = null;

        try {

            String query = prop.getProperty("modifyEmp");

            pstmt = con.prepareStatement(query);

            System.out.print("핸드폰 번호를 수정할 직원의 사번을 입력하세요 : ");
            empId = sc.nextInt();
            System.out.print("새로운 핸드폰 번호를 입력하세요 : ");
            sc.nextLine();
            String empPhone = sc.nextLine();


            pstmt.setInt(2, empId);
            pstmt.setString(1, empPhone);

            result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("직원 수정 성공 !");
            } else {
                System.out.println("직원 수정 실패 ... ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public int deleteEmp() {
        int result = 0;
        int empId = 0;

        PreparedStatement pstmt = null;

        try {
            String query = prop.getProperty("deleteEmp");

            pstmt = con.prepareStatement(query);

            System.out.print("삭제할 직원의 사번을 입력하세요 : ");
            empId = sc.nextInt();

            pstmt.setInt(1, empId);

            result = pstmt.executeUpdate();

            if (result > 0) {
                System.out.println("직원 삭제 성공 !");
            } else {
                System.out.println("직원 삭제 실패 ... ");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(pstmt);
        }

        return result;
    }


}