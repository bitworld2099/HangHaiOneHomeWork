package com.lhj.entities;

import javafx.scene.chart.PieChart;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Generated;
import org.springframework.data.relational.core.mapping.Embedded;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Shinelon
 */
@Entity(name = "tb_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String email;

    private String sex;

    private String province;

    private String hobby;
}
