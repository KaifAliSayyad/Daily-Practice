import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'power'
})
export class PowerPipe implements PipeTransform {

  transform(value: number, ...args: number[]): number {
    let result = value;
    for(let i = 1 ; i < args[0] ; i++){
      result *= value;
    }
    return result;
  }

}
