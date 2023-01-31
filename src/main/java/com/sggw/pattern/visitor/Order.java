package com.sggw.pattern.visitor;

import java.util.List;

public abstract class Order {
   public List<Integer> items;

   protected String accept(Visitor visitor){
      if(visitor instanceof VisitorInfo){
         return visitor.info(this);
      }
      return "Cost:" + visitor.sum(this);
   }

   @Override
   public String toString() {
      return "Order{" +
              "items=" + items +
              '}';
   }
}
