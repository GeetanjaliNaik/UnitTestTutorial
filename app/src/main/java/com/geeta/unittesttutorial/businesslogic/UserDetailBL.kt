package com.geeta.unittesttutorial.businesslogic

import com.geeta.unittesttutorial.data.UserDetail

class UserDetailBL {

    fun calculateYearlySalary(userDetail: UserDetail): Double {
        var yearlySalary = 0.0
        yearlySalary = userDetail.salary * 12
        return yearlySalary
    }
    fun calculateAppraisal(userDetail: UserDetail): Double {
        var appraisal = 0.0
        appraisal = if (userDetail.salary < 10000) {
            500.0
        } else {
            1000.0
        }
        return appraisal
    }
}