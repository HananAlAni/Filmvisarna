<template>
<div>
  <div class="dropdown"> 
    <label for="selectSalon">Välja Salongen</label>   
    <select v-model="selected" name="salons" @change="onChange($event)" class="select-css" >      
      <option
        v-for="option in options"
        v-bind:value="option.value"
        :key="option"
        name="salons"
      >
        {{ option.text }}
      </option>
    </select>
  </div>
  <div v-if="isBigSalon">
    <h3><u>Stora Salongen</u></h3>
  </div>  
   <div v-else>
      <h3><u>Lilla Salongen</u></h3>
    </div>   
  <div class="scene">
    <div class="display">scene</div>
  </div>
  <div class="seats">
    <div v-if="isBigSalon">
      <div v-for="row in x[0].seatsPerRow" :key="row" class="row">
        <div v-for="seat in row" :key="seat" class="seat"></div>
      </div>
      <p>{{ x[0].name }} har {{ x[0].seats }} plats</p>
    </div>
    <div v-else>
     
      <div v-for="row in y[0].seatsPerRow" :key="row" class="row">
        <div v-for="seat in row" :key="seat" class="seat"></div>
      </div>
      <p>{{ y[0].name }} har {{ y[0].seats }} plats</p>      
    </div>
  </div>
</div>
</template>

<script>
export default {
  data() {
    return {
      x: [
        {
          name: "Stora Salongen",
          seats: 81,
          seatsPerRow: [8, 9, 10, 10, 10, 10, 12, 12],
        },
      ],
      y: [
        {
          name: "Lilla Salongen",
          seats: 56,
          seatsPerRow: [6, 8, 9, 10, 10, 12],
        },
      ],
      selected: "big",
      options: [
        { text: "Stora", value: "big" },
        { text: "Lilla", value: "small" },
      ],
    isBigSalon:true,
    };
  },
  methods: {
    onChange(event) {      
      if (event.target.value == "big") {
        this.isBigSalon = true;
      }
      else  this.isBigSalon = false;
    },
  },
};
</script>

<style>
* {
  box-sizing: border-box;
}
.scene {
  display: flex;
  justify-content: center;
  border-bottom-left-radius: 10px;
  border-bottom-right-radius: 10px;
}

.row {
  display: flex;
  justify-content: center;
  padding: 5px;
}

.seat {
  width: 15px;
  height: 20px;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
  background: #eee;
  border: 1px solid black;
  margin: 5px;
  padding: 10px;
}

.seat:hover {
  background: rgba(51, 51, 51, 0.534);
}
.dropdown {
  padding-top:5px;
  padding-bottom:5px;
  color:rgb(133, 82, 17) ;
  margin: 8px;
  font-size: 20px;
  font-family: sans-serif;
  font-weight: 600;
  text-align: right;
}
.select-css { 
  font-size: 16px;
  font-family: sans-serif;
  font-weight: 600;
  text-align: left;
  color:white;
  padding: .6em 1.4em .5em .8em;
  line-height: 1.3;  
  width: 10%;
  max-width: 100%; /* useful when width is set to anything other than 100% */  
  box-sizing: border-box;
  margin: 0;
  border: 1px solid #aaa;
  box-shadow: 0 1px 0 1px rgba(0,0,0,.04);
  border-radius: .5em;
  -moz-appearance: none;
  -webkit-appearance: none;
  appearance: none;
  background-color: rgb(112, 97, 97);
  background-position: right .7em top 50%, 0 0;
  /* icon size, then gradient */
  background-size: .65em auto, 100%;
}

u {
  padding-top:5px;
  padding-bottom:5px;
  text-decoration:none;
  border-bottom:3px solid #000;
}
p {
  padding-top:10px;
  padding-bottom:10px;
  }

.display {
  border: 1px solid black;
  position: relative;
  background-color: whitesmoke;
  color: black;
  bottom: 5px;
  margin: 2em;
  width: 50%;
  border-top-width: 50%;
  border-bottom-width: 30%;
  height: 60px;
  display: flex;
  justify-content: center;
  box-shadow: 0 5px 5px #333;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
  border-bottom-left-radius: 70px;
  border-bottom-right-radius: 70px;
}
</style>