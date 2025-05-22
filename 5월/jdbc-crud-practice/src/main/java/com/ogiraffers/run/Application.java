package com.ogiraffers.run;

import com.ogiraffers.model.dao.EmployeeDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        Scanner sc = new Scanner(System.in);

        System.out.print("1. 직원 전체 조회" + '\n' +
                "2. 직원 선택 조회" + '\n' + "3. 직원 추가" + '\n' +
                "4. 직원 핸드폰 번호 수정" + '\n' + "5. 직원 선택 삭제" + '\n' + "실행할 메뉴 번호 : ");
        int num = sc.nextInt();

        switch(num) {
            case 1: employeeDAO.selectAllEmp(); break;
            case 2: employeeDAO.selectByIdEmp();break;
            case 3: employeeDAO.insertEmp();break;
            case 4: employeeDAO.modifyEmp();break;
            case 5: employeeDAO.deleteEmp();break;
        }

    }
}
