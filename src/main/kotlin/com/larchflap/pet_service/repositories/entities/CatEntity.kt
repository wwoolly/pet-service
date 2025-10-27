package com.larchflap.pet_service.repositories.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.OffsetDateTime
import java.util.UUID

@Entity
@Table(name = "cats")
data class CatEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(columnDefinition = "UUID", updatable = false, nullable = false)
  val id: UUID? = null,

  @Column(nullable = false, unique = true)
  val name: String,

  @Column(name = "created_at")
  val createdAt: OffsetDateTime = OffsetDateTime.now()
)
