package ru.max.eshop.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Rubanenko Maxim
 * 27.11.2022
 */

//Create table orders (
//    id bigserial primary key,
//    created_at timestamp default current_timestamp,
//    --    status_id bigint references order_status(id),
//    --    user_id bigint references   users(id),
//    userid bigint userid,
//    cost    numeric(8,2)
//    --);

@Entity
@Table(name = "orders")
@NoArgsConstructor
@Data
public class Orders {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "order_product",
      joinColumns = @JoinColumn(name = "id_order"),
      inverseJoinColumns = @JoinColumn(name = "id_product")
  )

  private List<Products> products;

  @Column(name = "userid")
  private Long userid;

  @Column(name = "created_at")
  private Timestamp created_at;

  @Column(name = "cost")
  private Float cost;
}
