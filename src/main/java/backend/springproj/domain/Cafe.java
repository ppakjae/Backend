package backend.springproj.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Cafe {

    @Id @GeneratedValue
    @Column(name = "cafe_id")
    private int id;

    @OneToOne(mappedBy = "cafe")
    private LocationId locationID;

//    private MoodStatus moodStatuses;
    // https://prohannah.tistory.com/133
    // 임베디드 타입을 바꿔야할거같기도하고
    @ElementCollection
    private ArrayList<MoodStatus> moodStatus;

    private int noise;

    private String tableShape;

    private Boolean chair;

    private Boolean socket;

    private LocalDateTime openTime;

    private String Photo;

    private Boolean toilet;

    private Boolean studyCafe;



}