package ru.rail.smarthome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camera")
public class Camera {

    @Id
    @Column
    Long id;

    @Column
    String name;

}
