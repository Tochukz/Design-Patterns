<?php

abstract class Garden {
    abstract public function harvest();

    public function grow() {
      return $this->harvest();
    }
}