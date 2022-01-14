package com.stream.model;

public class Customer {

    private Long id;
    private String name;
    private String internalNotes;

    public Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.internalNotes = builder.internalNotes;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInternalNotes() {
        return internalNotes;
    }

    public static class Builder {
        private Long id;
        private String name;
        private String internalNotes;

        public Customer build() {
            return new Customer(this);
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder internalNotes(String internalNotes) {
            this.internalNotes = internalNotes;
            return this;
        }

    }

}
