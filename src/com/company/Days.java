package com.company;

public enum Days {
    ДУЙШОМБУ("Дуйшомбу куну жава окуйм."),
    ШЕЙШЕМБИ("Шейшемби куну практика кылам"),
    ШАРШЕМБИ("Шаршенби куну жава окуйм."),
    БЕЙШЕМБИ("Бейшемби куну англис тили сабагын окуйм"),
    ЖУМА("Жума куну жава окуйм."),
    ИШЕМБИ("Ишемби куну практика кылам."),
    ЖЕКШЕМБИ("Жекшемби куну дем алыш куну.");

    Days() {
    }
    private String schedule;

    Days(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Days{" +
                "schedule='" + schedule + '\'' +
                '}';
    }
}
