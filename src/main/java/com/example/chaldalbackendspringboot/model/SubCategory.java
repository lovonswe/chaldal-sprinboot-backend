package com.example.chaldalbackendspringboot.model;
import com.example.chaldalbackendspringboot.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "subCategory", cascade = CascadeType.ALL) //default fetchtype lazy
    @JsonManagedReference
    private List<SubSubCategory> subSubCategories;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    @JsonBackReference
    private Category category;
}

//The mappedBy attribute is used in bidirectional relationships to specify the owning side of the relationship. It is typically used with @OneToMany or @OneToOne associations where you have a bidirectional relationship and need to specify which side is the owning side.